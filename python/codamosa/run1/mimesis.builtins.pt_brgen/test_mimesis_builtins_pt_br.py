# Automatically generated by Pynguin.
import mimesis.builtins.pt_br as module_0

def test_case_0():
    brazil_spec_provider_0 = module_0.BrazilSpecProvider()

def test_case_1():
    bool_0 = False
    bytes_0 = b'\xcb'
    brazil_spec_provider_0 = module_0.BrazilSpecProvider(bytes_0)
    str_0 = brazil_spec_provider_0.cnpj()
    brazil_spec_provider_1 = module_0.BrazilSpecProvider()
    brazil_spec_provider_2 = module_0.BrazilSpecProvider()
    str_1 = brazil_spec_provider_2.cpf(bool_0)
    brazil_spec_provider_3 = module_0.BrazilSpecProvider()
    str_2 = brazil_spec_provider_3.cnpj()

def test_case_2():
    brazil_spec_provider_0 = module_0.BrazilSpecProvider()
    str_0 = brazil_spec_provider_0.cpf()

def test_case_3():
    brazil_spec_provider_0 = module_0.BrazilSpecProvider()
    str_0 = brazil_spec_provider_0.cpf()

def test_case_4():
    bool_0 = False
    brazil_spec_provider_0 = module_0.BrazilSpecProvider()
    str_0 = brazil_spec_provider_0.cnpj(bool_0)

def test_case_5():
    brazil_spec_provider_0 = module_0.BrazilSpecProvider()
    str_0 = brazil_spec_provider_0.cnpj()

def test_case_6():
    brazil_spec_provider_0 = module_0.BrazilSpecProvider()
    str_0 = brazil_spec_provider_0.cnpj()
    str_1 = brazil_spec_provider_0.cpf()