# Tabelas HashMap and HashSet
## HashMap
hash map estrutura de chave a valor.
ela indexa rapidamente. 
- busca e inserção e remoção o (1) em média 
- Aceita valores null
```
Map<String, Integer> idade = new HashMap<>();
idade.put("Lucas", 8);
idade.put("Matheus", 32);
System.out.println(idade.get("Lucas")); // 8
```
## HashSet
- Guarda apenas valores únicos, nao tem chave valor 
- Internamente usa um HashMap com valor fixo
```
Set<String, Integer> nomes = new HashSet<>();
nomes.add("Lucas");
nomes.add("Matheus");
System.out.println(nomes.size()); // 1
```