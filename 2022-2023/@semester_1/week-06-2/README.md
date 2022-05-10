## $какво разгледахме днес ?
- упражнение
- Предаване на параметри на методи
- Метод overloading
- Статични и инстанционни методи
- Създаване на нови класове съдържащи статични методи
- ключовата дума continue

## $задачи за упражнения
- [Работа в час](https://github.com/mihail-petrov/netit-webdev-java/tree/master/2022-2023/%40semester_1/week-06-2/cw)


## $други ресурси
- [видео](https://drive.google.com/file/d/1aaZdCd3Uk_1wlH0mIpcYT9fock4Wn_mt/view?usp=sharing)
- [сорс код](https://github.com/mihail-petrov/netit-webdev-java/tree/master/2022-2023/%40semester_1/week-06-2/source)


## Предаване на параметри на методи
 До момента разгледахме следните особености на методите:
 - методите могат да връща или да не връщат стойност
 - методите имат опаковат и съдържат в себе си функционалност

Добавяме към този микс още една особеност, с която вече сме до голяма степен запознати. Възможността да подадем информация, към метода, под формата на аргумент.

В посочения пример, аргумента **outputMessage** се дефинира между отваряща и затравяща малка скоба със специфичен тип.
- идентификаторите на аргументите могат да се ползват като стандартни променливи

```java
public static void output(String outputMessage) {
    System.out.println(outputMessage);
}
```

## Метод overloading

Java ни дава възможност да дефинираме методи с едно и също име но различна сигнатура. Нека разгледаме следните три метода:
- и трите метода имат едно и също име **number**
- основната разлика между методите са ТИПОВЕТЕ на техните аргументи. 

```java

public static int number(int upperBound) {
    return randomGenerator.nextInt(upperBound) + 1;
}

public static int number(int lowerBound, int upperBound) {
    return lowerBound + number(upperBound);
}

public static double number() {
    return randomGenerator.nextDouble();
}

```

Ползвахме думичката сигнатура - това означава - **ИМЕ НА МЕТОД** + **ТИПОВЕ НА ПАРАМЕТРИ**. Връщаните типове, на методите не са част от сигнатурата и не се възприемат от Java като уникални. Ако опитаме да overload-нем метод с различен връщан тип но еднакви типове на параметри, Java ще ги възприеме като един и същи метод, което респекнивно значи грешка. 

## Статични и инстанционни методи

До момента в нашето приключение срещаме постоянно, една специална ключова дума **static** , която изписваме преди всеки метод до момента. Нека разберем идеята зад нея и всички особености, които тя носи със себе си. 

Да се върнем една крачка назад. 

```java
```