# Automatically generated by Pynguin.
import typesystem.tokenize.tokenize_yaml as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '2#PRs|Gn\\CBw/mKz-P u'
    token_0 = module_0.tokenize_yaml(str_0)

def test_case_2():
    str_0 = 'key: 123'
    token_0 = module_0.tokenize_yaml(str_0)

def test_case_3():
    str_0 = '-'
    token_0 = module_0.tokenize_yaml(str_0)

def test_case_4():
    str_0 = '\n        title: "Typesystem"\n        sections:\n          - title: "Overview"\n            text: "Welcome to the Typesystem documentation."\n          - title: "Reference"\n            text: "The reference contains everything you need to know."\n          - text: "The reference is currently being written."\n        published: true\n    '
    token_0 = module_0.tokenize_yaml(str_0)

def test_case_5():
    str_0 = '\n    lat: -33.859972\n    lng: 151.211111\n    '
    token_0 = module_0.tokenize_yaml(str_0)