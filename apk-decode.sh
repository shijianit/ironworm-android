# 反编译apk，请把apk放到apks目录下
echo "apk list"
index=1
fileNames=()
filePaths=()
for fileName in `ls apks`; do
  path="apks/$fileName"
  echo "$index. $path"
  filePaths[index]=$path
  fileNames[index]=$fileName
  index=$((index+1))
done
#echo ${fileArray[@]}
echo -n "please input decode apk num: "
read input

filePath=${filePaths[input]}
fileName=${fileNames[input]}
echo $filePath
echo $fileName

chmod 777 ./apktool-install.sh
./apktool-install.sh

outDir=${fileName%%.*}
apktool d -o "projects/$outDir" $filePath
