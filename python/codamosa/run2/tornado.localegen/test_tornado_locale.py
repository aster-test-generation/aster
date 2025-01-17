# Automatically generated by Pynguin.
import tornado.locale as module_0
import gettext as module_1
import datetime as module_2

def test_case_0():
    iterable_0 = module_0.get_supported_locales()

def test_case_1():
    locale_0 = module_0.get()

def test_case_2():
    str_0 = 'Z4M7|%r\rs\t'
    module_0.set_default_locale(str_0)
    locale_0 = module_0.get()
    str_1 = 'zh_CN'
    str_2 = locale_0.translate(str_1)

def test_case_3():
    str_0 = ' J:$pB>YLp\x0cl9l'
    str_1 = 'WQnHT/FM[Nb+!fHD\x0bdz'
    list_0 = [str_0, str_1]
    locale_0 = module_0.get(*list_0)

def test_case_4():
    str_0 = 'Jb,8*\ng'
    int_0 = 384
    str_1 = 'A dictionary that maintains ``Http-Header-Case`` for all keys.\n\n    Supports multiple values per key via a pair of new methods,\n    `add()` and `get_list()`.  The regular dictionary interface\n    returns a single value per key, with multiple values joined by a\n    comma.\n\n    >>> h = HTTPHeaders({"content-type": "text/html"})\n    >>> list(h.keys())\n    [\'Content-Type\']\n    >>> h["Content-Type"]\n    \'text/html\'\n\n    >>> h.add("Set-Cookie", "A=B")\n    >>> h.add("Set-Cookie", "C=D")\n    >>> h["set-cookie"]\n    \'A=B,C=D\'\n    >>> h.get_list("set-cookie")\n    [\'A=B\', \'C=D\']\n\n    >>> for (k,v) in sorted(h.get_all()):\n    ...    print(\'%s: %s\' % (k,v))\n    ...\n    Content-Type: text/html\n    Set-Cookie: A=B\n    Set-Cookie: C=D\n    '
    dict_0 = {}
    list_0 = [str_0, str_1]
    locale_0 = module_0.get(*list_0)
    dict_1 = {str_1: dict_0}
    c_s_v_locale_0 = module_0.CSVLocale(str_1, dict_1)
    str_2 = c_s_v_locale_0.translate(str_0, str_0, int_0)

def test_case_5():
    locale_0 = module_0.get()
    str_0 = 'zh_CN'
    list_0 = [str_0, str_0]
    locale_1 = module_0.get(*list_0)

def test_case_6():
    str_0 = '/sphGHz0}n(|`j-]r~'
    null_translations_0 = module_1.NullTranslations()
    gettext_locale_0 = module_0.GettextLocale(str_0, null_translations_0)

def test_case_7():
    float_0 = 2593.13
    locale_0 = module_0.get()
    str_0 = locale_0.format_date(float_0)

def test_case_8():
    float_0 = -4468.587630543761
    locale_0 = module_0.get()
    str_0 = locale_0.format_date(float_0)
    int_0 = 581
    bool_0 = True
    str_1 = locale_0.format_date(int_0, bool_0)

def test_case_9():
    float_0 = -4429.651495
    locale_0 = module_0.get()
    str_0 = locale_0.format_date(float_0)

def test_case_10():
    str_0 = '7yBbI\x0b)qbh%Vd;!wTiq/'
    locale_0 = module_0.get()
    str_1 = locale_0.list(str_0)

def test_case_11():
    int_0 = -768
    locale_0 = module_0.get()
    str_0 = locale_0.friendly_number(int_0)

def test_case_12():
    int_0 = 384
    str_0 = 'A dictionary that maintains ``Http-Header-Case`` for all keys.\n\n    Supports multiple values per key via a pair of new methods,\n    `add()` and `get_list()`.  The regular dictionary interface\n    returns a single value per key, with multiple values joined by a\n    comma.\n\n    >>> h = HTTPHeaders({"content-type": "text/html"})\n    >>> list(h.keys())\n    [\'Content-Type\']\n    >>> h["Content-Type"]\n    \'text/html\'\n\n    >>> h.add("Set-Cookie", "A=B")\n    >>> h.add("Set-Cookie", "C=D")\n    >>> h["set-cookie"]\n    \'A=B,C=D\'\n    >>> h.get_list("set-cookie")\n    [\'A=B\', \'C=D\']\n\n    >>> for (k,v) in sorted(h.get_all()):\n    ...    print(\'%s: %s\' % (k,v))\n    ...\n    Content-Type: text/html\n    Set-Cookie: A=B\n    Set-Cookie: C=D\n    '
    dict_0 = {}
    dict_1 = {str_0: dict_0}
    c_s_v_locale_0 = module_0.CSVLocale(str_0, dict_1)
    str_1 = c_s_v_locale_0.translate(str_0, str_0, int_0)

def test_case_13():
    str_0 = 'x7fCETQ'
    str_1 = None
    str_2 = None
    dict_0 = {str_0: str_0, str_1: str_1, str_2: str_1}
    str_3 = 'Y34yBiPs1'
    str_4 = 'response_type'
    dict_1 = {str_4: str_3}
    dict_2 = {str_3: dict_1, str_3: dict_1, str_4: dict_1}
    c_s_v_locale_0 = module_0.CSVLocale(str_3, dict_2)
    str_5 = c_s_v_locale_0.pgettext(str_0, str_0, str_0, dict_0)

def test_case_14():
    str_0 = 'tjx1i<<\x0c$'
    int_0 = 545
    null_translations_0 = module_1.NullTranslations()
    gettext_locale_0 = module_0.GettextLocale(str_0, null_translations_0)
    str_1 = gettext_locale_0.pgettext(str_0, str_0, str_0, int_0)

def test_case_15():
    str_0 = None
    str_1 = '}~d,]NC<~ZJ'
    null_translations_0 = module_1.NullTranslations()
    gettext_locale_0 = module_0.GettextLocale(str_1, null_translations_0)
    str_2 = gettext_locale_0.pgettext(str_1, str_0)

def test_case_16():
    float_0 = -4429.193335895991
    str_0 = ''
    str_1 = 'MCN'
    str_2 = ' 3\\nRhl<SaPz\x0cA'
    list_0 = [str_0, str_2, str_1, str_2]
    locale_0 = module_0.get(*list_0)
    str_3 = locale_0.format_date(float_0)

def test_case_17():
    str_0 = 'ar_AR'
    null_translations_0 = module_1.NullTranslations()
    gettext_locale_0 = module_0.GettextLocale(str_0, null_translations_0)
    locale_0 = module_0.get()
    str_1 = 'v'
    str_2 = locale_0.list(str_1)

def test_case_18():
    float_0 = -4428.624678163025
    str_0 = '?gA"7;9*{9'
    str_1 = 'Lj'
    str_2 = '%\x0c4'
    list_0 = [str_0, str_1, str_2]
    locale_0 = module_0.get(*list_0)
    int_0 = -1664
    bool_0 = True
    str_3 = locale_0.format_date(float_0, int_0, bool_0, bool_0)

def test_case_19():
    float_0 = -4429.524198458578
    locale_0 = module_0.get()
    str_0 = 'en_US'
    list_0 = [str_0]
    locale_1 = module_0.get(*list_0)
    bool_0 = True
    str_1 = locale_1.format_date(float_0, bool_0)

def test_case_20():
    str_0 = 'x9'
    module_0.set_default_locale(str_0)
    str_1 = '^\\QNy;'
    str_2 = 'cpAF'
    bool_0 = True
    str_3 = ''
    str_4 = ' "DSqRcE$I%\x0c=C~v'
    str_5 = '{m??\tdT8_2NWGvo1'
    str_6 = 'N9r<\x0bDzRoOf9'
    str_7 = '5l;$l#C;KH"5* Kx'
    dict_0 = {str_5: str_6, str_5: str_7}
    str_8 = 'r`*4\\`=('
    str_9 = "DN\t%9@758~-vOhf}N'6"
    dict_1 = {str_4: dict_0, str_4: dict_0, str_8: dict_0, str_9: dict_0}
    c_s_v_locale_0 = module_0.CSVLocale(str_3, dict_1)
    str_10 = c_s_v_locale_0.pgettext(str_1, str_2, str_0, bool_0)

def test_case_21():
    str_0 = '?gA"7;9*{9'
    str_1 = 'Lj'
    str_2 = '%\x0c4'
    list_0 = [str_0, str_1, str_2]
    locale_0 = module_0.get(*list_0)
    int_0 = -1664
    bool_0 = True
    locale_1 = module_0.get()
    int_1 = 94
    bool_1 = False
    bool_2 = True
    str_3 = locale_0.format_date(int_0, int_1, bool_1, bool_2, bool_0)

def test_case_22():
    str_0 = 'y\tNltLF${@\n\tS#O`'
    str_1 = 'eH8'
    list_0 = [str_1]
    locale_0 = module_0.get(*list_0)
    str_2 = None
    str_3 = locale_0.translate(str_2)
    float_0 = -4460.569338754707
    locale_1 = module_0.get()
    str_4 = locale_1.format_date(float_0)
    str_5 = locale_1.list(str_4)
    locale_2 = module_0.get(*list_0)
    int_0 = 4018
    str_6 = locale_0.list(str_0)
    int_1 = -16
    str_7 = locale_0.friendly_number(int_0)
    bool_0 = True
    str_8 = locale_0.format_date(int_0, bool_0)
    timedelta_0 = module_2.timedelta()
    null_translations_0 = module_1.NullTranslations(timedelta_0)
    gettext_locale_0 = module_0.GettextLocale(str_5, null_translations_0)
    locale_3 = module_0.get()
    str_9 = locale_3.format_date(int_1)
    str_10 = 'B'
    gettext_locale_1 = module_0.GettextLocale(str_10, null_translations_0)
    str_11 = '8\rJvV2`'
    str_12 = gettext_locale_1.pgettext(str_11, str_7)
    str_13 = 'P\x0c'
    module_0.load_translations(str_13)

def test_case_23():
    str_0 = 'y8NltLF${@:\tS#O`'
    str_1 = 'eH8'
    list_0 = [str_1]
    locale_0 = module_0.get()
    str_2 = locale_0.list(str_1)
    locale_1 = module_0.get(*list_0)
    str_3 = locale_1.translate(str_0)
    float_0 = -4460.569338754707
    int_0 = -3911
    str_4 = locale_1.list(str_1)
    locale_2 = module_0.get()
    str_5 = ':HiF"\tpI/NJVz<0K\x0bq'
    str_6 = 'WSWP,J{73:Gu9fY2R:'
    str_7 = locale_2.pgettext(str_5, str_4, str_6, int_0)
    str_8 = locale_2.format_date(float_0)
    str_9 = locale_2.list(str_8)
    locale_3 = module_0.get(*list_0)
    locale_4 = module_0.get()
    str_10 = locale_4.list(str_9)
    int_1 = -582
    str_11 = locale_1.friendly_number(int_1)
    str_12 = '1B<u/c?W@#l`'
    null_translations_0 = module_1.NullTranslations()
    gettext_locale_0 = module_0.GettextLocale(str_12, null_translations_0)
    str_13 = 'P\x0c'
    str_14 = 'WYI0VX3QcP}/6rY'
    gettext_locale_1 = module_0.GettextLocale(str_14, null_translations_0)
    str_15 = ')1VBEr8v|ASzr{'
    str_16 = gettext_locale_0.pgettext(str_3, str_15)
    str_17 = 'Y}6:L=7[L!8QHU'
    module_0.load_gettext_translations(str_13, str_17)