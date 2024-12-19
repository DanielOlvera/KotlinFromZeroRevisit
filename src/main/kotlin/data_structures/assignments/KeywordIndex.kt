package data_structures.assignments

/**
 * def keyword_index(docs):
# implement this
index_dict = {}
for idx, doc in enumerate(docs):
for word in doc.split():
if word not in index_dict:
index_dict[word] = {}
if idx not in index_dict[word]:
index_dict[word][idx] = 0
index_dict[word][idx] += 1
return index_dict

docs = ["Hello world", "world of python", "python is a snake"]
print(keyword_index(docs))  # Expected output: {'Hello': {0: 1}, 'world': {0: 1, 1: 1}, 'of': {1: 1}, 'python': {1: 1, 2: 1}, 'is': {2: 1}, 'a': {2: 1}, 'snake': {2: 1}}
 */