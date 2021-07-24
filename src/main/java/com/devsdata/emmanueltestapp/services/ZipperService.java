package com.devsdata.emmanueltestapp.services;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class ZipperService
{
    
    private static final String EXTENSION = "zip";

    public ZipperService()
    {
        
    }

	/*
	 * Helps unpack zip files
	 * @param String password the password to decrypt the zip file
	 * @param String sourceZipFilePath the source file path
	 * @param String extractedZipFilePath the destination directory
	 * @return void
	 */
    public void unpack(String password, String sourceZipFilePath, String extractedZipFilePath) throws ZipException
    {
    	try {
	        ZipFile zipFile = new ZipFile(sourceZipFilePath + "." + EXTENSION);
	
	        if (zipFile.isEncrypted())
	        {
	            zipFile.setPassword(password.toCharArray());
	        }
	        zipFile.extractAll(extractedZipFilePath);
			zipFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
