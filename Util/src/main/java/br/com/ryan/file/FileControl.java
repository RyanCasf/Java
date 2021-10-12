package br.com.ryan.file;

import java.io.File;

public class FileControl extends FileInterface
{
	@Override
	public File findFile(String path, String name, String extensible) 
	{
		System.out.println(path+name.concat(".").concat(extensible));
		File file = new File(path, name.concat(".").concat(extensible));
		
		if(file != null && file.exists() && file.isFile())
		{
			return file;
		}
		
		return null;
	}

	@Override
	public File[] findDir(String path) 
	{
		
		return null;
	}

	@Override
	public void saveFile(String path, String name, String extensible, boolean isBlackToNew) 
	{
		
	}

	@Override
	public void deleteFile(String path, String name, String extensible) 
	{
		
	}
}