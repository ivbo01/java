var="prak1/num4" # запуск нужной папки

javac $var/*.java -d output # компиляция всех файлов
java -cp output $var/Main # поиск в папке output