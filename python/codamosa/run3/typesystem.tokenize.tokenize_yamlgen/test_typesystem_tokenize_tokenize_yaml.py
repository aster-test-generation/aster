# Automatically generated by Pynguin.
import typesystem.tokenize.tokenize_yaml as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '\n    name: "John"\n    age: 30\n    friends:\n      - "Bob"\n      - "Alice"\n    '
    token_0 = module_0.tokenize_yaml(str_0)

def test_case_2():
    str_0 = '\n    name: John Doe\n    age: 30\n    score: 95.3\n    '
    token_0 = module_0.tokenize_yaml(str_0)