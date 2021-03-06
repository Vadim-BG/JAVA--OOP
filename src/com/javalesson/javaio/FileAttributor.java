package com.javalesson.javaio;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;

public class FileAttributor {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp");

        System.out.println("Size " + Files.size(path));
        System.out.println("Date modified " + Files.getLastModifiedTime(path));
        System.out.println("Is writable " + Files.isWritable(path));

        FileStore fs = Files.getFileStore(path);


        validateView(fs, BasicFileAttributeView.class);
        validateView(fs, DosFileAttributeView.class);
        validateView(fs, PosixFileAttributeView.class);
        validateView(fs, AclFileAttributeView.class);
        validateView(fs, UserDefinedFileAttributeView.class);
        validateView(fs, FileOwnerAttributeView.class);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("Creation time "+dosFileAttributes.creationTime());
        System.out.println("Is hidden "+dosFileAttributes.isHidden());

//        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rwx------");
//        FileAttribute<Set<PosixFilePermission>> fileAttribs = PosixFilePermissions.asFileAttribute(posixFilePermissions);
//        Files.createFile(Paths.get("File1.txt"),fileAttribs);

    }

    private static void validateView(FileStore fs, Class<? extends FileAttributeView> viewClass) {
        boolean supports = fs.supportsFileAttributeView(viewClass);
        System.out.println("Supports "+viewClass.getSimpleName()+" - "+supports);
    }

}
