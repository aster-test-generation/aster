# Automatically generated by Pynguin.
import mimesis.providers.cryptographic as module_0
import mimesis.enums as module_1

def test_case_0():
    try:
        cryptographic_0 = module_0.Cryptographic()
        int_0 = 50
        str_0 = cryptographic_0.mnemonic_phrase(int_0)
        int_1 = 1450
        bool_0 = True
        var_0 = cryptographic_0.uuid(bool_0)
        cryptographic_1 = module_0.Cryptographic()
        bytes_0 = cryptographic_1.token_bytes(int_1)
        bytes_1 = cryptographic_0.token_bytes()
        int_2 = 102
        str_1 = cryptographic_1.hash()
        str_2 = cryptographic_1.token_hex()
        cryptographic_2 = module_0.Cryptographic()
        str_3 = cryptographic_2.hash()
        bytes_2 = cryptographic_2.token_bytes(int_2)
        bytes_3 = cryptographic_2.token_bytes()
        str_4 = cryptographic_0.mnemonic_phrase(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = -2427
        cryptographic_0 = module_0.Cryptographic()
        var_0 = cryptographic_0.token_urlsafe(int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '& };'
        cryptographic_0 = module_0.Cryptographic()
        str_1 = cryptographic_0.mnemonic_phrase(str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = -4750
        str_0 = 'Ox=&b3zmU+9:azdU'
        cryptographic_0 = module_0.Cryptographic()
        str_1 = cryptographic_0.mnemonic_phrase(int_0, str_0)
        cryptographic_1 = module_0.Cryptographic()
        var_0 = cryptographic_1.token_urlsafe()
        str_2 = cryptographic_1.token_hex()
        str_3 = 'crureus'
        str_4 = '^/Enb*\x0b\x0b<8uTgqb'
        list_0 = [str_1]
        dict_0 = {str_3: cryptographic_0, str_1: str_2, str_4: list_0}
        cryptographic_2 = module_0.Cryptographic(**dict_0)
    except BaseException:
        pass

def test_case_4():
    try:
        algorithm_0 = module_1.Algorithm.SHA224
        list_0 = [algorithm_0]
        cryptographic_0 = module_0.Cryptographic()
        cryptographic_1 = module_0.Cryptographic()
        var_0 = cryptographic_0.uuid()
        str_0 = cryptographic_1.token_hex()
        str_1 = 'l'
        dict_0 = {str_1: algorithm_0}
        cryptographic_2 = module_0.Cryptographic(*list_0)
        str_2 = cryptographic_2.mnemonic_phrase()
        cryptographic_3 = module_0.Cryptographic(*list_0, **dict_0)
    except BaseException:
        pass