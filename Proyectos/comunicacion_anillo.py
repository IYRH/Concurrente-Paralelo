import random
from mpi4py import MPI

comm = MPI.COMM_WORLD
rank = comm.Get_rank()
data = 0

if rank ==0:
	data =random.randint(1,100)
	comm.send(data,dest=1,tag =1)
	data =comm.recv(source=4,tag=5)
	print 'Proceso 0 dato final: ',data

elif rank == 1:
	data =comm.recv(source=0,tag=1)
	print 'Proceso 1: ',data
	data = data+1
	comm.send(data,dest=2,tag=2)
elif rank == 2:
	data =comm.recv(source=1,tag=2)
	print 'Proceso 2: ',data
	data = data+1
	comm.send(data,dest=3,tag=3)
elif rank == 3:
	data =comm.recv(source=2,tag=3)
	print 'Proceso 3: ',data
	data = data+1
	comm.send(data,dest=4,tag=4)
elif rank == 4:
	data =comm.recv(source=3,tag=4)
	print 'Proceso 4: ',data
	data = data+1
	comm.send(data,dest=0,tag=5)


	

