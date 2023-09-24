var="prak4_1/num1" # запуск нужной папки

javac $var/*.java -d output # компиляция всех файлов
java -cp output $var/TestShape # поиск в папке output