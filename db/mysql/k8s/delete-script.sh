kubectl delete deployment,svc mysql
kubectl delete pvc mysql-pv-claim --force=true
kubectl patch pvc mysql-pv-claim -p '{"metadata":{"finalizers":null}}'
kubectl delete pv mysql-pv --grace-period=0 --force
kubectl patch pv mysql-pv -p '{"metadata": {"finalizers": null}}'
kubectl delete secret mysql-secret