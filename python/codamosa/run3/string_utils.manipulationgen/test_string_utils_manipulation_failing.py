# Automatically generated by Pynguin.
import string_utils.manipulation as module_0

def test_case_0():
    try:
        int_0 = -5574
        str_0 = module_0.roman_encode(int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'g|7l'
        str_1 = module_0.asciify(str_0)
        str_2 = '@"&-\'#11.e#W==<F'
        str_3 = module_0.roman_encode(str_2)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '.5:}n]}kD+ivMPi'
        str_1 = module_0.slugify(str_0, str_0)
        str_2 = 'R")p'
        str_3 = module_0.prettify(str_2)
        str_4 = '@@Si8E\x0b23G`&qHe'
        bool_0 = True
        str_5 = module_0.strip_html(str_0, bool_0)
        int_0 = module_0.roman_decode(str_4)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '@w\\O>v(6I'
        int_0 = module_0.roman_decode(str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '0'
        str_1 = module_0.shuffle(str_0)
        str_2 = None
        str_3 = ',S\x0cNY+Z~qGQ'
        str_4 = module_0.asciify(str_3)
        int_0 = module_0.roman_decode(str_2)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'W'
        str_1 = module_0.decompress(str_0, str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 's_uAi'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = '0(j|ixE<W,m5g. \r(V2'
        str_3 = module_0.shuffle(str_2)
        str_4 = '\n    Checks if the given string represents a valid ISBN (International Standard Book Number).\n    By default hyphens in the string are ignored, so digits can be separated in different ways, by calling this\n    function with `normalize=False` only digit-only strings will pass the validation.\n\n    *Examples:*\n\n    >>> is_isbn(\'9780312498580\') # returns true\n    >>> is_isbn(\'1506715214\') # returns true\n\n    :param input_string: String to check.\n    :param normalize: True to ignore hyphens ("-") in the string (default), false otherwise.\n    :return: True if valid ISBN (10 or 13), false otherwise.\n    '
        string_formatter_0 = module_0.__StringFormatter(str_4)
        str_5 = string_formatter_0.format()
        int_0 = 2093
        bool_0 = True
        str_6 = module_0.snake_case_to_camel(str_2, bool_0)
        str_7 = module_0.roman_encode(int_0)
        str_8 = 'g{Sj&|}\x0c'
        str_9 = module_0.snake_case_to_camel(str_8)
        str_10 = None
        str_11 = module_0.compress(str_10, str_5)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = '8D QH\n&t<n8P?D'
        str_1 = 'H}r/M,\\xUG\n_Eh'
        int_0 = -1031
        str_2 = module_0.compress(str_0, str_1, int_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = '`":Ey-]\'4*(5;V.`_H;'
        str_1 = module_0.shuffle(str_0)
        str_2 = 'A;\t2S<\r'
        str_3 = module_0.compress(str_2)
        str_4 = '[@UV=Nt$iQz[u'
        str_5 = module_0.decompress(str_4)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'm\rot!_r@*^cp[_,-xi\nX'
        str_1 = module_0.decompress(str_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'I'
        str_1 = 'HQim_s\\<q@Dk~'
        str_2 = module_0.reverse(str_1)
        dict_0 = {str_0: str_0}
        string_formatter_0 = module_0.__StringFormatter(dict_0)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = "\rBEQ_T<ul'?uX>\n#"
        bool_0 = True
        var_0 = module_0.camel_case_to_snake(bool_0, str_0)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = 'm\rot!_r@*^cp[_,-xi\nX'
        str_1 = 'm\nO\x0b3BHj 3%:0u\x0c\x0bs'
        str_2 = module_0.snake_case_to_camel(str_1)
        str_3 = module_0.decompress(str_0)
    except BaseException:
        pass

def test_case_13():
    try:
        str_0 = None
        bool_0 = True
        str_1 = module_0.snake_case_to_camel(str_0, bool_0)
    except BaseException:
        pass

def test_case_14():
    try:
        str_0 = 'm\rot!_r@*^cp[_,-xi\nX'
        str_1 = module_0.strip_html(str_0)
        str_2 = 'm\nO\x0b3BHj 3%:0u\x0c\x0bs'
        str_3 = module_0.snake_case_to_camel(str_2)
        str_4 = module_0.decompress(str_0)
    except BaseException:
        pass

def test_case_15():
    try:
        str_0 = None
        str_1 = module_0.asciify(str_0)
    except BaseException:
        pass

def test_case_16():
    try:
        str_0 = None
        bool_0 = module_0.booleanize(str_0)
    except BaseException:
        pass

def test_case_17():
    try:
        str_0 = 'Wzw<]q-d'
        var_0 = module_0.camel_case_to_snake(str_0)
        str_1 = "\n    Generates a random string using secure low level random generator (os.urandom).\n\n    **Bear in mind**: due to hex conversion, the returned string will have a size that is exactly    the double of the given `byte_count`.\n\n    *Example:*\n\n    >>> secure_random_hex(9) # possible output: 'aac4cf1d1d87bd5036'\n\n    :param byte_count: Number of random bytes to generate\n    :type byte_count: int\n    :return: Hexadecimal string representation of generated random bytes\n    "
        str_2 = module_0.strip_margin(str_1)
        str_3 = 'Q1'
        str_4 = module_0.shuffle(str_3)
        str_5 = module_0.roman_encode(str_1)
    except BaseException:
        pass

def test_case_18():
    try:
        str_0 = 'mf(Lkhu`kthTCV'
        str_1 = "o$\tT'rhU@`MR"
        str_2 = module_0.compress(str_1)
        string_formatter_0 = module_0.__StringFormatter(str_0)
        str_3 = None
        str_4 = module_0.strip_margin(str_3)
    except BaseException:
        pass

def test_case_19():
    try:
        str_0 = None
        str_1 = module_0.slugify(str_0)
    except BaseException:
        pass

def test_case_20():
    try:
        int_0 = 3232
        str_0 = module_0.roman_encode(int_0)
        int_1 = 2055
        str_1 = 'F'
        str_2 = module_0.compress(str_1)
        str_3 = module_0.roman_encode(int_1)
        str_4 = 'v&PnnaO'
        str_5 = module_0.slugify(str_2)
        str_6 = module_0.asciify(str_4)
        int_2 = 1564
        str_7 = module_0.roman_encode(int_2)
        str_8 = 'W'
        str_9 = module_0.shuffle(str_4)
        bool_0 = module_0.booleanize(str_4)
        str_10 = ')_[ y,\\4'
        list_0 = [str_10, str_8, str_7]
        string_formatter_0 = module_0.__StringFormatter(list_0)
    except BaseException:
        pass

def test_case_21():
    try:
        int_0 = 2055
        str_0 = "\n    Force string content to be ascii-only by translating all non-ascii chars into the closest possible representation\n    (eg: ó -> o, Ë -> E, ç -> c...).\n\n    **Bear in mind**: Some chars may be lost if impossible to translate.\n\n    *Example:*\n\n    >>> asciify('èéùúòóäåëýñÅÀÁÇÌÍÑÓË') # returns 'eeuuooaaeynAAACIINOE'\n\n    :param input_string: String to convert\n    :return: Ascii utf-8 string\n    "
        bool_0 = None
        str_1 = module_0.snake_case_to_camel(str_0, bool_0)
        str_2 = 'F='
        str_3 = module_0.compress(str_2)
        str_4 = module_0.roman_encode(int_0)
        str_5 = 'v&PnnaO'
        list_0 = [str_5, str_2, str_3, str_3]
        list_1 = [str_4, str_3, list_0, list_0]
        string_compressor_0 = module_0.__StringCompressor(*list_1)
    except BaseException:
        pass

def test_case_22():
    try:
        str_0 = 'lDmb,S'
        bool_0 = False
        str_1 = module_0.snake_case_to_camel(str_0, bool_0)
        str_2 = module_0.prettify(str_0)
        str_3 = None
        bool_1 = None
        str_4 = module_0.strip_html(str_3, bool_1)
    except BaseException:
        pass

def test_case_23():
    try:
        str_0 = '>PDP~ L(3'
        bool_0 = module_0.booleanize(str_0)
        str_1 = module_0.slugify(str_0)
        str_2 = 'Input string cannot be empty'
        int_0 = -2111
        str_3 = module_0.compress(str_2, int_0)
    except BaseException:
        pass

def test_case_24():
    try:
        roman_numbers_0 = module_0.__RomanNumbers()
        str_0 = '?o_:yi&CY/.Ny.F`n\x0cfe'
        str_1 = module_0.compress(str_0)
        str_2 = module_0.decompress(str_1)
        str_3 = '\nv'
        str_4 = module_0.snake_case_to_camel(str_3)
        str_5 = '9%GC!+'
        str_6 = "N=\x0c'}W`E~s"
        str_7 = 'CeTCw:{0'
        str_8 = module_0.strip_margin(str_7)
        str_9 = 'Invalid encoding'
        str_10 = module_0.snake_case_to_camel(str_6, str_9)
        dict_0 = {str_6: str_5}
        string_formatter_0 = module_0.__StringFormatter(dict_0)
    except BaseException:
        pass

def test_case_25():
    try:
        str_0 = 'Gl6KkL(.Z'
        str_1 = module_0.compress(str_0)
        str_2 = module_0.snake_case_to_camel(str_0)
        string_compressor_0 = module_0.__StringCompressor()
        str_3 = '.+}D=ciwOgQpc75I9\\[u'
        str_4 = module_0.reverse(str_3)
        roman_numbers_0 = module_0.__RomanNumbers()
        str_5 = "H]_4\tuO$0'\nyn-s"
        str_6 = module_0.asciify(str_5)
        int_0 = 2432
        str_7 = 'e">\rlur'
        str_8 = module_0.prettify(str_7)
        str_9 = module_0.roman_encode(int_0)
        bool_0 = module_0.booleanize(str_6)
        str_10 = module_0.slugify(str_1)
        int_1 = 9
        str_11 = module_0.roman_encode(int_1)
        int_2 = module_0.roman_decode(str_5)
    except BaseException:
        pass

def test_case_26():
    try:
        str_0 = 's_uAi'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = '0(j|ixE<W,m5g. \r(V2'
        str_3 = module_0.shuffle(str_2)
        str_4 = '\n    Checks if the given string represents a valid ISBN (International Standard Book Number).\n    By default hyphens in the string are ignored, so digits can be separated in different ways, by calling this\n    function with `normalize=False` only digit-only strings will pass the validation.\n\n    *Examples:*\n\n    >>> is_isbn(\'9780312498580\') # returns true\n    >>> is_isbn(\'1506715214\') # returns true\n\n    :param input_string: String to check.\n    :param normalize: True to ignore hyphens ("-") in the string (default), false otherwise.\n    :return: True if valid ISBN (10 or 13), false otherwise.\n    '
        string_formatter_0 = module_0.__StringFormatter(str_4)
        str_5 = string_formatter_0.format()
        int_0 = 2092
        str_6 = '1N!*spe_p|B0OgKAx~f'
        bool_0 = True
        str_7 = module_0.snake_case_to_camel(str_6, bool_0)
        str_8 = module_0.roman_encode(int_0)
        str_9 = 'L'
        str_10 = module_0.compress(str_4, str_9, int_0)
    except BaseException:
        pass

def test_case_27():
    try:
        str_0 = 'lDmb,S'
        bool_0 = False
        str_1 = module_0.snake_case_to_camel(str_0, bool_0)
        str_2 = module_0.prettify(str_0)
        str_3 = 'X\r7\\\r:eOmMxnb:'
        bool_1 = False
        str_4 = module_0.strip_html(str_3, bool_1)
        str_5 = module_0.reverse(str_2)
        str_6 = '@>7w'
        str_7 = module_0.strip_margin(str_6)
        int_0 = -363
        var_0 = module_0.camel_case_to_snake(str_4, int_0)
        str_8 = '>{gVugA&gs/=Z#'
        str_9 = 'XhL?d>:8#JV7i gN+'
        str_10 = module_0.slugify(str_8, str_9)
        str_11 = 'V5l1!q'
        str_12 = module_0.asciify(str_11)
        str_13 = ''
        str_14 = module_0.compress(str_13)
    except BaseException:
        pass

def test_case_28():
    try:
        str_0 = 'is_uuid'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = module_0.compress(str_0)
        str_3 = '1N!*spe_p|B0OgKAx~f'
        str_4 = module_0.snake_case_to_camel(str_3)
        str_5 = 'L#vZK#F%q2H%<'
        str_6 = module_0.asciify(str_5)
        int_0 = 1562
        str_7 = module_0.roman_encode(int_0)
        str_8 = module_0.roman_encode(int_0)
        str_9 = '?fE{D\\#^Qb>Y9qiu'
        int_1 = module_0.roman_decode(str_9)
    except BaseException:
        pass

def test_case_29():
    try:
        str_0 = 'is_uuid'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = None
        str_3 = module_0.shuffle(str_2)
    except BaseException:
        pass

def test_case_30():
    try:
        str_0 = 's_uAi'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = module_0.shuffle(str_0)
        str_3 = '\n    Checks if the given string represents a valid ISBN (International Standard Book Number).\n    By default hyphens in the string are ignored, so digits can be separated in different ways, by calling this\n    function with `normalize=False` only digit-only strings will pass the validation.\n\n    *Examples:*\n\n    >>> is_isbn(\'9780312498580\') # returns true\n    >>> is_isbn(\'1506715214\') # returns true\n\n    :param input_string: String to check.\n    :param normalize: True to ignore hyphens ("-") in the string (default), false otherwise.\n    :return: True if valid ISBN (10 or 13), false otherwise.\n    '
        string_formatter_0 = module_0.__StringFormatter(str_3)
        str_4 = string_formatter_0.format()
        int_0 = 2055
        bool_0 = False
        str_5 = module_0.snake_case_to_camel(str_0, bool_0)
        str_6 = module_0.roman_encode(int_0)
        str_7 = 'Input must be a non empty string'
        str_8 = module_0.compress(str_7)
        str_9 = module_0.asciify(str_4)
        list_0 = [str_4, str_1, bool_0]
        roman_numbers_0 = module_0.__RomanNumbers(*list_0)
    except BaseException:
        pass

def test_case_31():
    try:
        str_0 = None
        str_1 = module_0.reverse(str_0)
    except BaseException:
        pass

def test_case_32():
    try:
        str_0 = '_uw'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = '0(j|ixE<W,m5g. \r(V2'
        str_3 = module_0.shuffle(str_2)
        dict_0 = {str_3: str_1, str_0: str_2}
        string_formatter_0 = module_0.__StringFormatter(dict_0)
    except BaseException:
        pass

def test_case_33():
    try:
        str_0 = 's_uAi'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = '0(j|ixE<W,m5g. \r(V2'
        str_3 = module_0.shuffle(str_2)
        str_4 = '\n    Checks if the given string represents a valid ISBN (International Standard Book Number).\n    By default hyphens in the string are ignored, so digits can be separated in different ways, by calling this\n    function with `normalize=False` only digit-only strings will pass the validation.\n\n    *Examples:*\n\n    >>> is_isbn(\'9780312498580\') # returns true\n    >>> is_isbn(\'1506715214\') # returns true\n\n    :param input_string: String to check.\n    :param normalize: True to ignore hyphens ("-") in the string (default), false otherwise.\n    :return: True if valid ISBN (10 or 13), false otherwise.\n    '
        string_formatter_0 = module_0.__StringFormatter(str_4)
        str_5 = string_formatter_0.format()
        int_0 = 2080
        str_6 = '1N!*spe_p|B0OgKAx~f'
        bool_0 = True
        str_7 = module_0.snake_case_to_camel(str_6, bool_0)
        str_8 = module_0.roman_encode(int_0)
        str_9 = 'Input must be a non empty string'
        str_10 = 'g{Sj&|}\x0c'
        str_11 = module_0.snake_case_to_camel(str_10)
        str_12 = module_0.compress(str_9)
        str_13 = '#vZK#F%q2H%<'
        list_0 = [str_13]
        var_0 = module_0.camel_case_to_snake(str_1, list_0)
    except BaseException:
        pass

def test_case_34():
    try:
        str_0 = 's_uAi'
        str_1 = module_0.snake_case_to_camel(str_0)
        str_2 = module_0.shuffle(str_0)
        str_3 = '\n    Checks if the given string represents a valid ISBN (International Standard Book Number).\n    By default hyphens in the string are ignored, so digits can be separated in differen ways, by calling this\n    f5nction with `normalize=False` only digit-only strings will pas4 the validation.\n\n    *Examples:*\n\n    >>> is_isbn(\'9780312498580\') # returns true\n    >>> is_isbn(\'150671521V\') # returns true\n\n    :param input_string: String to check.\n    :param normalize: True to ignore hyphens ("-") in the string (default), false otherwise.\n    :return: True if valid ISBN (10 or 13), false otherwise.\n    '
        string_formatter_0 = module_0.__StringFormatter(str_3)
        str_4 = string_formatter_0.format()
        int_0 = None
        str_5 = module_0.compress(str_2, str_3, int_0)
    except BaseException:
        pass

def test_case_35():
    try:
        int_0 = 5453
        str_0 = module_0.roman_encode(int_0)
    except BaseException:
        pass