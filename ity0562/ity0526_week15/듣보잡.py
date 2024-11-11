import sys

N, M = map(int, sys.stdin.readline().split())
nl_list = []
ns_list = []

for _ in range(N):
    nl_list.append(sys.stdin.readline().strip())

for _ in range(M):
    ns_list.append(sys.stdin.readline().strip())

nls_set = set(nl_list) & set(ns_list)
print(len(nls_set))

for i in sorted(nls_set):
    print(i)