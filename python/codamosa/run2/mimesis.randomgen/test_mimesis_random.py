# Automatically generated by Pynguin.
import mimesis.random as module_0

def test_case_0():
    random_0 = module_0.Random()

def test_case_1():
    str_0 = '<K%'
    random_0 = module_0.Random()
    float_0 = 2.0
    float_1 = 1267.7084
    int_0 = 968
    list_0 = random_0.randints(int_0)
    random_1 = module_0.Random(float_0)
    int_1 = 1232
    float_2 = random_0.uniform(float_0, float_1, int_1)
    str_1 = random_0.custom_code(str_0)

def test_case_2():
    str_0 = 'U-%%u6hSQjB'
    random_0 = module_0.Random()
    str_1 = random_0.generate_string(str_0)

def test_case_3():
    str_0 = 'r+yL_4R'
    random_0 = module_0.Random()
    str_1 = random_0.custom_code(str_0)

def test_case_4():
    random_0 = module_0.Random()
    str_0 = random_0.custom_code()

def test_case_5():
    float_0 = -408.8259
    float_1 = -591.51482
    int_0 = 3938
    random_0 = module_0.Random()
    float_2 = random_0.uniform(float_0, float_1, int_0)