#/bin/bash

if [ $# -eq 4 ]
then
config_file="$2_generator.xml"
cp generator.xml $config_file
echo $config_file
sed -i -e "s/{\$groupId}/$1/g" $config_file
sed -i -e "s/{\$artifactId}/$2/g" $config_file
sed -i -e "s/{\$database}/$2/g" $config_file
sed -i -e "s/{\$user}/$3/g" $config_file
sed -i -e "s/{\$passwd}/$4/g" $config_file
elif [ $# -eq 3 ]
then
temp_config="temp_$1"
cp $1 $temp_config
sed -i -e "s/{\$table}/$2/g" $temp_config
sed -i -e "s/{\$model}/$3/g" $temp_config
java -jar mybatis-generator-core-1.3.2.jar -configfile $temp_config -overwrite
rm $temp_config
else
echo "init: run.sh com\.xincao todo root asdf"
echo "use: run.sh config_file.xml  table Model"
fi