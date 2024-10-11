import unittest
import sys
from types import ModuleType
from pytutils import make_laz


class TestLazyModule(unittest.TestCase):
    def test_make_lazy(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        self.assertIsInstance(lazy_module, ModuleType)
        self.assertIsInstance(lazy_module, _LazyModuleMarker)

    def test_lazy_module_getattr(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        lazy_module.__getattribute__('attr')
        self.assertTrue(hasattr(sys.modules, module_path))
        self.assertIsInstance(sys.modules[module_path], ModuleType)

    def test_lazy_module_getattr_multiple_times(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        lazy_module.__getattribute__('attr')
        lazy_module.__getattribute__('attr')
        self.assertTrue(hasattr(sys.modules, module_path))
        self.assertIsInstance(sys.modules[module_path], ModuleType)

    def test_lazy_module_getattr_multiple_times_with_different_attributes(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        lazy_module.__getattribute__('attr1')
        lazy_module.__getattribute__('attr2')
        self.assertTrue(hasattr(sys.modules, module_path))
        self.assertIsInstance(sys.modules[module_path], ModuleType)

    def test_lazy_module_getattr_with_non_existent_attribute(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        with self.assertRaises(AttributeError):
            lazy_module.__getattribute__('non_existent_attr')

    def test_lazy_module_str(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        self.assertIsInstance(str(lazy_module), str)

    def test_lazy_module_repr(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        self.assertIsInstance(repr(lazy_module), str)

if __name__ == '__main__':
    unittest.main()