package com.company;

public class Main {
/*
    Создать класс Weapon (Оружие), с приватными полями тип оружия и
    название оружия.

    Создать класс GameEntity (Игровая сущность), выделить
    все общие поля которые присущи
    и Боссу и Героям и добавить геттеры и сеттеры к ним.

    Создать класс Босса, наследовать его от класса GameEntity и
    дополнить его полем сложного
    типа данных Weapon (то есть дать оружие боссу). Также добавить
    геттеры и сеттеры для этого поля.

    В классе Main создать 1 экземпляр босса и задать ему все свойства
    (значения полям).
    Затем распечатать всю информацию о боссе.

*/

    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setName("AK-47");
        weapon.setType("Автомат");
        Boss tanos = new Boss();
        tanos.setDamage(200);
        tanos.setDefence("Magic");
        tanos.setHealth(1000);
        System.out.println(tanos.getDamage() + " "
                + tanos.getDefence() + " " + " " +
                tanos.getHealth()+ " "+weapon.getName()+" " +
                ""+ weapon.getType());
    }
}
