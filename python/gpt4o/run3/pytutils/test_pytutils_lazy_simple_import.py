import unittest
import sys
from types import ModuleType
from pytutils.lazy.simple_import import _LazyModuleMarker, NonLocal, make_lazy


class TestLazyModuleMarker(unittest.TestCase):
    def test_instance_creation(self):
        instance = _LazyModuleMarker()
        self.assertIsInstance(instance, _LazyModuleMarker)

class TestNonLocal(unittest.TestCase):
    def test_init(self):
        instance = NonLocal(10)
        self.assertEqual(instance.value, 10)

class TestMakeLazy(unittest.TestCase):
    def setUp(self):
        self.module_path = 'test_module'
        sys.modules[self.module_path] = ModuleType(self.module_path)

    def tearDown(self):
        if self.module_path in sys.modules:
            del sys.modules[self.module_path]

    def test_make_lazy(self):
        make_lazy(self.module_path)
        self.assertIsInstance(sys.modules[self.module_path], _LazyModuleMarker)

    def test_lazy_module_mro(self):
        make_lazy(self.module_path)
        lazy_module = sys.modules[self.module_path]
        self.assertEqual(lazy_module.__mro__(), (lazy_module.__class__, types.ModuleType))

    def test_lazy_module_getattribute(self):
        make_lazy(self.module_path)
        lazy_module = sys.modules[self.module_path]
        sys.modules[self.module_path].test_attr = 'test_value'
        self.assertEqual(lazy_module.test_attr, 'test_value')

if __name__ == '__main__':
    unittest.main()