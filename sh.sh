var="prak2_2" # запуск нужной папки

javac $var/*.java -d output # компиляция всех файлов
java -cp output $var/TestBall # поиск в папке output