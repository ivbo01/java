var="prak2" # запуск нужной папки

javac $var/*.java -d output # компиляция всех файлов
java -cp output $var/TestAuthor # поиск в папке output