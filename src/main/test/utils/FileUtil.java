//package utils;
//
//import java.io.File;
//
//public class FileUtil {
//	/**
//     * 通过文件路径直接修改文件名
//     * @param filePath 需要修改的文件的完整路径
//     * @param newFileName 需要修改的文件的名称
//     * @return
//     */
//    public static String FixFileName(String filePath, String newFileName) {
//    	
//        File f = new File(filePath);
//        if (!f.exists()) { // 判断原文件是否存在
//            return null;
//        }
//        
//        newFileName = newFileName.trim();
//        if ("".equals(newFileName) || newFileName == null) // 文件名不能为空
//            return null;
//        
//        String newFilePath = null;
//        
//    	int index = filePath.lastIndexOf("/");
//    	if(index == -1) {
//    		index = filePath.lastIndexOf("\\");
//    	}
//        newFilePath = filePath.substring(0, index)+ "/"  + newFileName;
//        File nf = new File(newFilePath);
//        if (!f.exists()) { // 判断需要修改为的文件是否存在（防止文件名冲突）
//            return null;
//        }
//        
//        try {
//            f.renameTo(nf); // 修改文件名
//        } catch(Exception err) {
//            err.printStackTrace();
//            return null;
//        }
//        
//        return newFilePath;
//    }
//}
