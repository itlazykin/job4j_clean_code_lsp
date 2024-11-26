package ru.job4j.ood.isp.menu;

public class Printer implements MenuPrinter {
    private static final String INDENT = "    ";

    @Override
    public void print(Menu menu) {
        menu.forEach(menuItemInfo -> {
            String num = menuItemInfo.getNumber();
            int countIndent = num.split("\\.").length - 1;
            String line = INDENT.repeat(countIndent) + num + menuItemInfo.getName();
            System.out.println(line);
        });
    }
}

