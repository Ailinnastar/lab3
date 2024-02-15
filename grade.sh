# set -e
CAPTH= 

rm -rf studebt submition 
git clone $1 studebt submition 
echo 'Finished cloning'


if [[]]
then 
    echo "Missing Necessary File"
    exit
fi
echo "continue"

cp TestListExamples.java 

cd grading-area
pwd

javac -cp $CAPTH *.java
if [$? -ne 0]
then 
    echo 'compiler error'
    exit 1
fi
