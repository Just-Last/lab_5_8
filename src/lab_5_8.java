public class lab_5_8 {
    public static void main(String[] args) throws Exception {
        //№1
        System.out.println("Завдання № 1");
        int n = 34;
        if (n < 25 && n < 100){
            System.out.println("Число " + n + " не міститься в проміжку (25; 100)");
        }else{
            System.out.println("Число " + n + " міститься в проміжку (25; 100)");
        }
        //№2
        System.out.println("Завдання № 2");
        int z, c, v, b;
        n = 982;
        z = n / 100;
        c = (n - z * 100) / 10;
        v = (n - z * 100 - c * 10) % 10;
        b = 0;
        if (z > c && z > v){
            b = z;      
        }if ( c > z && c > v){
            b = c;
        }if ( v > z && v > c ){
            b = v;
        }
        System.out.println("n = " + n);
        System.out.println("Найбільше число: " + b);
        //№3
        System.out.println("Завдання № 3");
        String direction = "Підйом"; 
        int floor = 2; 
        if ( direction == "Підйом" ){
            if ( floor == 1 )
            {System.out.println("Ви піднялись на 1 поверх");} 
            if ( floor == 2 )
            {System.out.println("Ви піднялись на 3 поверх");}
            if ( floor == 3 ) 
            {System.out.println("Ви піднялись на 3 поверх");}
            if ( floor == 4 )
            {System.out.println("Ви піднялись на 4 поверх");} 
            if ( floor == 5 ) 
            {System.out.println("Ви піднялись на 5 поверх");}
            if ( floor == 6 ) 
            {System.out.println("Ви піднялись на 6 поверх");} 
            if ( floor == 7 )
            {System.out.println("Ви піднялись на 7 поверх");} 
            if ( floor == 8 ) 
            {System.out.println("Ви піднялись на 8 поверх");} 
            if ( floor == 9 ) 
            {System.out.println("Ви піднялись на 9 поверх");} 
            if ( floor > 9 || floor <1 )
            {System.out.println("Ви вказали неіснуючий поверх!");} 
        }
        if ( direction == "Спуск" ){
            if ( floor == 9 ) 
            {System.out.println("Ви спустились на 9 поверх");} 
            if ( floor == 8 ) 
            {System.out.println("Ви спустились на 8 поверх");} 
            if ( floor == 7 )  
            {System.out.println("Ви спустились на 7 поверх");} 
            if ( floor == 6 ) 
            {System.out.println("Ви спустились на 6 поверх");} 
            if ( floor == 5 ) 
            {System.out.println("Ви спустились на 5 поверх");} 
            if ( floor == 4 )  
            {System.out.println("Ви спустились на 4 поверх");}
            if ( floor == 3 )  
            {System.out.println("Ви спустились на 3 поверх");} 
            if ( floor == 2 ) 
            {System.out.println("Ви спустились на 1 поверх");} 
            if ( floor == 1 )  
            {System.out.println("Ви спустились на 1 поверх");}
            if ( floor > 9 || floor <1 )
            {System.out.println("Ви вказали неіснуючий поверх!");} 
        } 
        //№4
        System.out.println("Завдання № 4");
        String answ = "-";
        String answ_2 = "";
            switch (answ) {
                case "Так", "ОК", "Yes", "Y", "+", "Ok":
                answ_2 = "Я погоджуюсь!";
                break;
                case "Ні", "NO", "N", "-", "No":
                answ_2 = "Відмовитись";
                break;
                default:
                    System.out.println("Ви ввели  неправильну відповідь");
                };
        System.out.println(answ_2);
    }
}
