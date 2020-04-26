package com.itvdn.javaStarter.loops;

import java.util.Scanner;

public class C13_DijkstraLoop {
    // Цикл Дейкстры.

    // При выполнении цикла Дейкстры в каждой итерации происходит вычисление охраняемых условий.
    // Если хотя бы одно из них истинно, выполняется соответствующая охраняемая команда, после чего начинается новая итерация
    // (если истинны несколько охраняемых условий, выполняется только одна охраняемая команда).
    // Если все охраняемые условия ложны, цикл завершается.
    // Цикл Дейкстры с одним охраняющим условием и одной охраняемой командой представляет собой, по сути, обычный цикл с предусловием (цикл «while»).

    // Классическое описание цикла Дейкстры.
    // do
    //   P1 ? S1,
    //     …
    //   Pn ? Sn
    // od

    // где:
    // do — маркер начала конструкции цикла,
    // od — маркер завершения конструкции цикла,
    // Pi — i-тое охраняющее условие (логическое выражение, которое может иметь значение «истинно» или «ложно»),
    // Si — i-я охраняемая команда.

    // Цикл состоит из одной или нескольких ветвей (охраняемых выражений),
    // каждая из которых представляет собой пару из охраняющего условия и охраняемой команды.

    public static void main(String[] args) {
        char character;
        Scanner in = new Scanner(System.in);

        for (; ; ) {
            character = in.next().charAt(0);

            switch (character) {
                case 'l': // 'l' - охраняющее условие 1.
                    System.out.println("Go left");    // охраняемая команда.
                    continue;

                case 'r': // 'r' - охраняющее условие 2.
                    System.out.println("Go right");   // охраняемая команда.
                    continue;
            }
            break;  // Прерывание цикла.
        }
    }
}
