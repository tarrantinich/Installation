package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder tempStringBuilder = new StringBuilder();

        File src = new File("C://Games", "srk");
        if (src.mkdir()) tempStringBuilder.append("Создан каталог " + src.getName() + '\n');

        File res = new File("C://Games", "res");
        if (res.mkdir()) tempStringBuilder.append("Создан каталог " + res.getName() + '\n');

        File drawables = new File("C://Games/res", "drawables");
        if (drawables.mkdir()) tempStringBuilder.append("Создан каталог " + drawables.getName() + '\n');
        File vectors = new File("C://Games/res", "vectors");
        if (vectors.mkdir()) tempStringBuilder.append("Создан каталог " + vectors.getName() + '\n');
        File icons = new File("C://Games/res", "icons");
        if (icons.mkdir()) tempStringBuilder.append("Создан каталог " + icons.getName() + '\n');

        File savegames = new File("C://Games", "savegames");
        if (savegames.mkdir()) tempStringBuilder.append("Создан каталог " + savegames.getName() + '\n');

        File temp = new File("C://Games", "temp");
        if (temp.mkdir()) tempStringBuilder.append("Создан каталог " + temp.getName() + '\n');

        File main = new File("C://Games/srk", "main");
        if (main.mkdir()) tempStringBuilder.append("Создан каталог " + main.getName() + '\n');
        File mainFile = new File(main, "Main.java");
        try {
            if (mainFile.createNewFile())
                tempStringBuilder.append("Создан файл " + mainFile.getName() + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File utilsFile = new File(main, "Utils.java");
        try {
            if (utilsFile.createNewFile())
                tempStringBuilder.append("Создан файл " + utilsFile.getName() + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File test = new File("C://Games/srk", "test");
        if (test.mkdir()) tempStringBuilder.append("Создан каталог " + test.getName() + '\n');

        try (FileWriter writer = new FileWriter("C://Games/temp/temp.txt", false)) {
            writer.write(tempStringBuilder.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
