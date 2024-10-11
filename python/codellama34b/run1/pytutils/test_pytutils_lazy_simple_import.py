import unittest
from pytutils.lazy.simple_import import *


class TestLazyModuleMarker(unittest.TestCase):
    def test_mro(self):
        instance = LazyModuleMarker()
        result = instance.__mro__()
        self.assertEqual(result, (LazyModule, ModuleType))

class TestNonLocal(unittest.TestCase):
    def test_init(self):
        instance = NonLocal(1)
        self.assertEqual(instance.value, 1)

    def test_getattribute(self):
        instance = NonLocal(1)
        result = instance.__getattribute__("value")
        self.assertEqual(result, 1)

class TestMakeLazy(unittest.TestCase):
    def test_make_lazy(self):
        module_path = "test_module"
        result = make_lazy(module_path)
        self.assertEqual(result, LazyModule)

if __name__ == '__main__':
    unittest.main()