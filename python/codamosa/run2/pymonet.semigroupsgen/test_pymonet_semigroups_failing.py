# Automatically generated by Pynguin.
import pymonet.semigroups as module_0

def test_case_0():
    try:
        tuple_0 = ()
        int_0 = -2364
        str_0 = '%:z2%"xDtaeroWC_T'
        min_0 = module_0.Min(str_0)
        max_0 = module_0.Max(min_0)
        min_1 = module_0.Min(max_0)
        str_1 = min_1.__str__()
        last_0 = module_0.Last(int_0)
        semigroup_0 = module_0.Semigroup(last_0)
        var_0 = semigroup_0.fold(tuple_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 255.612
        sum_0 = module_0.Sum(float_0)
        float_1 = -2148.36
        last_0 = module_0.Last(float_1)
        sum_1 = module_0.Sum(last_0)
        sum_2 = sum_1.concat(sum_0)
    except BaseException:
        pass

def test_case_2():
    try:
        all_0 = None
        str_0 = '8<2}=)37Y'
        semigroup_0 = module_0.Semigroup(str_0)
        all_1 = module_0.All(semigroup_0)
        all_2 = all_1.concat(all_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ':qO,0ruNS<&F\rjxj>B'
        float_0 = 3790.58
        last_0 = module_0.Last(float_0)
        last_1 = module_0.Last(last_0)
        str_1 = last_1.__str__()
        last_2 = module_0.Last(str_0)
        bool_0 = False
        min_0 = module_0.Min(bool_0)
        one_0 = module_0.One(str_0)
        str_2 = one_0.__str__()
        sum_0 = module_0.Sum(min_0)
        first_0 = module_0.First(sum_0)
        sum_1 = sum_0.concat(sum_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = 655.1154
        last_0 = module_0.Last(float_0)
        float_1 = 609.877749
        var_0 = last_0.concat(float_1)
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = 3063.60555
        int_0 = -268
        max_0 = module_0.Max(int_0)
        str_0 = max_0.__str__()
        max_1 = module_0.Max(float_0)
        str_1 = max_1.__str__()
        map_0 = module_0.Map(max_0)
        all_0 = module_0.All(map_0)
        var_0 = max_1.concat(all_0)
    except BaseException:
        pass

def test_case_6():
    try:
        int_0 = 1
        min_0 = module_0.Min(int_0)
        int_1 = 2
        min_1 = module_0.Min(int_1)
        var_0 = min_0.concat(min_1)
        var_1 = var_0.value
        int_2 = 3
        max_0 = module_0.Max(int_2)
        int_3 = 4
        max_1 = module_0.Max(int_3)
        var_2 = max_0.concat(max_1)
        var_3 = int_2.value
    except BaseException:
        pass

def test_case_7():
    try:
        first_0 = None
        one_0 = module_0.One(first_0)
        set_0 = set()
        semigroup_0 = module_0.Semigroup(set_0)
        str_0 = None
        var_0 = one_0.concat(str_0)
    except BaseException:
        pass

def test_case_8():
    try:
        bool_0 = False
        first_0 = module_0.First(bool_0)
        str_0 = 'bp6VS2S~Xx\r'
        str_1 = first_0.__str__()
        str_2 = '?==;X&H#](>%ER/\n=d'
        last_0 = None
        str_3 = first_0.__str__()
        str_4 = first_0.__str__()
        int_0 = 1443
        var_0 = first_0.concat(int_0)
        tuple_0 = (str_0, str_2, last_0)
        min_0 = module_0.Min(tuple_0)
        last_1 = module_0.Last(last_0)
        float_0 = 321.852
        last_2 = module_0.Last(float_0)
        int_1 = 48
        first_1 = module_0.First(int_1)
        semigroup_0 = module_0.Semigroup(min_0)
        int_2 = 596
        semigroup_1 = module_0.Semigroup(semigroup_0)
        bool_1 = semigroup_1.__eq__(int_2)
    except BaseException:
        pass