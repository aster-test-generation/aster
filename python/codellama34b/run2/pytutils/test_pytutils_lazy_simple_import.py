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

class TestMakeLazy(unittest.TestCase):
    def test_make_lazy(self):
        result = make_lazy('pytutils.lazy.simple_import')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()