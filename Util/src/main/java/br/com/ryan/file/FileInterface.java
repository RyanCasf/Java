package br.com.ryan.file;

import java.io.File;

abstract class FileInterface 
{
	public abstract File findFile(String path, String name, String extensible);
	public abstract File[] findDir(String path);
	public abstract void saveFile(String path, String name, String extensible, boolean isBlackToNew);
	public abstract void deleteFile(String path, String name, String extensible);
}