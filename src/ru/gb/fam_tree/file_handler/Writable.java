package ru.gb.fam_tree.file_handler;

import java.io.Serializable;


public interface Writable {
    void writeFamilyTree(Serializable serializable, String filePath);
    Serializable readFamilyTree(String filePath);
}