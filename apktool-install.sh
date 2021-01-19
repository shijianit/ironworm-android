# 安装apktool

binApkTool="/usr/local/bin/apktool"
binApkToolJar="/usr/local/bin/apktool.jar"

if [ ! -f "$binApkTool" ]; then
  sudo cp tools/apktool/apktool /usr/local/bin/
  sudo chmod 777 /usr/local/bin/apktool
fi

if [ ! -f "$binApkToolJar" ]; then
  sudo cp tools/apktool/apktool_2.4.1.jar /usr/local/bin/apktool.jar
  sudo chmod 777 /usr/local/bin/apktool.jar
fi

