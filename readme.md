## Gradle
### Build project
`./gradlew clean build`

### Build image
`./gradlew bootBuildImage --imageName=dukov82/hello`

## K8s
### Push image
`docker login`

`docker push dukov82/hello`


### Deploy to Kubernetes
`kubectl apply -f deployment.yaml`
`kubectl port-forward service/hello-k8s-svc 9090:8080`

