# Automatically generated by Pynguin.
import mimesis.providers.path as module_0

def test_case_0():
    path_0 = module_0.Path()

def test_case_1():
    path_0 = module_0.Path()
    str_0 = path_0.dev_dir()
    str_1 = path_0.project_dir()
    path_1 = module_0.Path()
    str_2 = path_0.users_folder()
    str_3 = path_1.root()

def test_case_2():
    path_0 = module_0.Path()
    str_0 = path_0.home()
    str_1 = path_0.users_folder()
    str_2 = path_0.home()

def test_case_3():
    path_0 = module_0.Path()
    str_0 = path_0.user()

def test_case_4():
    path_0 = module_0.Path()
    str_0 = path_0.project_dir()

def test_case_5():
    str_0 = 'linux'
    path_0 = module_0.Path(str_0)
    str_1 = 'darwin'
    path_1 = module_0.Path(str_1)
    str_2 = 'win32'
    path_2 = module_0.Path(str_2)
    str_3 = 'win64'
    path_3 = module_0.Path(str_3)
    str_4 = path_0.user()
    str_5 = path_1.user()
    str_6 = path_2.user()
    str_7 = path_3.user()