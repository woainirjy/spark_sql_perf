package com.rjy.spark.common;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtils {

    private static final Logger logger = LoggerUtils.getLogger(FileUtils.class);

    public static File openFile(String fileName) {

        String filePath = getFilePathV1(fileName);

        File file = new File(filePath);

        return file;
    }

    private static String getFilePathV1(String fileName) {
        String path = System.getProperty("user.dir");

        String filePath = path + "/conf/" + fileName;

        logger.info("get file in path: " + filePath);

        return filePath;
    }

}