# 打包apk

echo "project list"
index=1
filePaths=()
for fileName in `ls projects`; do
  path="projects/$fileName"
  echo "$index. $path"
  filePaths[index]=$path
  index=$((index+1))
done
#echo ${fileArray[@]}
echo -n "please input build project num: "
read input

filePath=${filePaths[input]}
echo "start build $filePath"

chmod 777 ./apktool-install.sh
./apktool-install.sh

apktool b -o "$filePath/dist/build.apk" $filePath

apkPath="$filePath/dist/build.apk"

if [ ! -f "$apkPath" ]; then
  echo "build apk fail."
  exit 0
fi

echo "build apk success. apk path: $apkPath"
echo "signer apk start"

signApkPath="$filePath/dist/sign.apk"
java -jar tools/apksigner/apksigner.jar sign --ks tools/apksigner/debug.keystore --ks-key-alias AndroidDebugKey --ks-pass pass:android --out "$signApkPath" "$apkPath"

echo "start install apk"
tools/adb/adb install "$signApkPath"