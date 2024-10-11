import unittest
from pytutils.lazy.simple_import import *


class TestLazyModuleMarker(unittest.TestCase):
    def test_lazy_module_marker(self):
        instance = LazyModuleMarker()
        result = instance.__mro__()
        self.assertEqual(result, (LazyModule, ModuleType))

    def test_lazy_module_marker_getattribute(self):
        instance = LazyModuleMarker()
        result = instance.__getattribute__("attr")
        self.assertEqual(result, getattr(module.value, attr))

class TestNonLocal(unittest.TestCase):
    def test_non_local(self):
        instance = NonLocal(None)
        result = instance.value
        self.assertEqual(result, None)

    def test_non_local_init(self):
        instance = NonLocal(None)
        result = instance.__init__("value")
        self.assertEqual(result, None)

class TestMakeLazy(unittest.TestCase):
    def test_make_lazy(self):
        result = make_lazy("module_path")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()