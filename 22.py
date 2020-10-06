import string

with open('p022_names.txt') as r:
    data = [name.strip('"') for name in r.read().split(',')]

data.sort()

def get_name_score(index, name):
    print([s for s in name])
    s = sum([string.ascii_uppercase.index(character) + 1 for character in name])
    print(s)
    return s * (index + 1)

print(sum([ get_name_score(index, name) for index,name in enumerate(data)]))
