//package com.sunpx.self.test;
//
//import java.io.File;
//import java.util.Arrays;
//import java.util.Map;
//
//import utils.Base64Utils;
//import utils.FileUtil;
//import utils.RSAUtils;
//
//public class MinTest {
//	
//	static String publicKey;
//	static String privateKey;
//
//	static {
//		try {
//			Map<String, Object> keyMap = RSAUtils.genKeyPair();
//			publicKey = RSAUtils.getPublicKey(keyMap);
//			privateKey = RSAUtils.getPrivateKey(keyMap);
//			System.err.println("publicKey: \n\r" + publicKey);
//			System.err.println("privateKey:\n\r" + privateKey);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public static void main(String[] args) throws Exception {
//		
////		System.out.println("公钥长度:" + publicKey.length());
////		System.out.println("私钥长度:" + privateKey.length());
////		
////		String crpyPath = "H:/Users/sunpx/Desktop/tmp";
////		String postfix = "`TMP`";
////		File file = new File(crpyPath);
////		String[] fileList = file.list();
////		
////		for (String fileName : fileList) {
////			String tmpFileName = crpyPath +"/"+ fileName;
////			
////			new Thread(new Runnable() {
////				
////				@Override
////				public void run() {
////					try {
////						encodeCrpy(tmpFileName , postfix);
////					} catch (Exception e) {
////						e.printStackTrace();
////					}
////				}
////			}).start();
////		}
//		System.out.println(foo(5));
//		
//	
//	}
//	
//	static int foo(int n) {
//		if(n < 2) return n;
//		return foo(n  - 1) + foo(n -2);
//	}
//	public static void encodeCrpy(String crpyPath , String postfix) throws Exception {
//		
//		File file = new File(crpyPath);
//		
//		String tmpFileName = file.getName()  +"."+ postfix;
//		
//		byte[] source = Base64Utils.fileToByte(crpyPath);
//		byte[] data = RSAUtils.encryptByPublicKey(source, publicKey);
//		System.out.println("加密后:" + data);
//		
//		//写入文件
//		Base64Utils.byteArrayToFile(data , crpyPath);
//		
//		//修改文件名
//		FileUtil.FixFileName(crpyPath, tmpFileName);
//		
//		//获取修改后的文件名
//		String crpyLastPath = new File(crpyPath).getParent() +"/"+ tmpFileName;
//		
//		System.out.println("等待中....");
//		Thread.sleep(3000);
//		//读取加密文件
//		byte[] source2 = Base64Utils.fileToByte(crpyLastPath);
//		//解密
//		byte[] buff = RSAUtils.decryptByPrivateKey(source2, privateKey);
//		System.out.println("解密后:" + buff);
//		Thread.sleep(2000);
//		//写入文件
//		Base64Utils.byteArrayToFile(buff , crpyLastPath);
//		
//		//修改文件名
//		FileUtil.FixFileName(crpyLastPath, file.getName());
//	}
//	
//	  /**
//     * byte数组转hex
//     * @param bytes
//     * @return
//     */
//    public static String byteToHex(byte[] bytes){
//        String strHex = "";
//        StringBuilder sb = new StringBuilder("");
//        for (int n = 0; n < bytes.length; n++) {
//            strHex = Integer.toHexString(bytes[n] & 0xFF);
//            sb.append((strHex.length() == 1) ? "0" + strHex : strHex); // 每个字节由两个字符表示，位数不够，高位补0
//        }
//        return sb.toString().trim();
//    }
//}
