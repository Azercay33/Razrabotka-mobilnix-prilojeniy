fun main() {
    println("        Типы данных в Kotlin       ")

    // Целочисленные типы
    println("1. Целочисленные типы (Integer Types):")
    println("   Byte  (8-битный):   Диапазон от ${Byte.MIN_VALUE} до ${Byte.MAX_VALUE}")
    println("   Short (16-битный):  Диапазон от ${Short.MIN_VALUE} до ${Short.MAX_VALUE}")
    println("   Int   (32-битный):  Диапазон от ${Int.MIN_VALUE} до ${Int.MAX_VALUE}")
    println("   Long  (64-битный):  Диапазон от ${Long.MIN_VALUE} до ${Long.MAX_VALUE}\n")

    // Числа с плавающей точкой
    println("2. Числа с плавающей точкой (Floating-Point Types):")
    println("   Float  (32-битный):  Диапазон от ${-Float.MAX_VALUE} до ${Float.MAX_VALUE}")
    println("   Double (64-битный):  Диапазон от ${-Double.MAX_VALUE} до ${Double.MAX_VALUE}\n")

    // Символы и строки
    println("3. Символы и строки:")
    println("   Char   (Символ):     Один символ. Пример: 'K'")
    println("   String (Строка):     Набор символов. Пример: \"Hello, Kotlin!\"\n")

    // Логический тип
    println("4. Логический тип (Boolean):")
    println("   Boolean:             Может быть true или false. Пример: val isActive = true\n")

    // Массивы
    println("5. Массивы:")
    println("   Array:               Набор элементов одного типа. Пример:")
    println("                        val numbers = arrayOf(1, 2, 3)")
    println("                        println(numbers[0]) // Вывод: 1\n")
    

    println("       Конец списка типов данных   ")
}