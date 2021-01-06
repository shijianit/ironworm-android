# 安装apktool

binApkTool="/usr/local/bin/apktool"
binApkToolJar="/usr/local/bin/apktool.jar"

if [ ! -f "$binApkTool" ]; then
  sudo cp apktool/apktool /usr/local/bin/
  sudo chmod 777 /usr/local/bin/apktool
fi

if [ ! -f "$binApkToolJar" ]; then
  sudo cp apktool/apktool.jar /usr/local/bin/
  sudo chmod 777 /usr/local/bin/apktool.jar
fi

