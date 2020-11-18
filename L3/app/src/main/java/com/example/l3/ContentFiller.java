package com.example.l3;
import java.util.ArrayList;
import java.util.List;

public class ContentFiller {
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    private static final int COUNT = 25;

    static {
        // Добавление элементов в список.
        for (int k = 0; k < COUNT; k++) {
            String[] builder = new String[COUNT];
            builder[0]="Информация об элементе:  " +(k+1);
            for (int j = 1; j <COUNT; j++) { builder[j]="Детальная информация. "; }
            ITEMS.add(new DummyItem(String.valueOf(k+1), "Элемент " + (k+1), builder));
        }
    }

    /** Создание класса элементов для списка. */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String[] details;

        public DummyItem(String id, String content, String[] details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }
        @Override
        public String toString() { return content; }
    }
}
