package com.meditab.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModulewithFile encodingModule = new EncodingModulewithFile();
        encodingModulewithFile.encodeWithFiles();
	EncodingModulewithDB encodingModule1 = new EncodingModulewithDB();
        encodingModule1.encodeBasedOnNetworkAndDatabase();
    }
}
