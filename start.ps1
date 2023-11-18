# запуск нужной папки
$var = "prak12/num1"

# компиляция всех файлов
javac $var/*.java -d output

# поиск в папке output
java -cp output $var/Main

# powershell -noexit -executionpolicy bypass -File start.ps1