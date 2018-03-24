#Scanner

>Scanner input = new Scanner(System.in);
>String name = input.nextLine();
>String name = input.next();

在输入字符串时，有两种方法：
* 如果使用input.nextLine()，那么就会读取Enter键之前输入的所有数据，包括有效数据之前或之后的空格，例如"  John "，那么name接收的值就是"  John "。
* 如果使用input.next()，那么对于输入有效字符前的所有空格、Tab键或Enter键等结束符，next()方法会自动将其去掉，只有在输入有效字符之后，next()方法才将其后的结束符视为结束。例如"    John "，那么name接收的值就是"John"。
