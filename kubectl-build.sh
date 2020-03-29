mvn clean package
mkdir -p target/dependency
(
  cd target/dependency || exit
  jar -xf ../*.jar
)
docker build -t localhost:5000/springboot-sample .
#docker push saliabbasraza/springboot-sample #For Google Cloud
docker push localhost:5000/springboot-sample #For local repository
kubectl apply -f deployment.yaml