import sys
from types import ModuleType
import unittest


class _LazyModuleMarker(object):
    pass

class NonLocal(object):
    __slots__ = ['value']
    def __init__(self, value):
        self.value = value

def make_lazy(module_path):
    sys_modules = sys.modules  
    module = NonLocal(None)
    class LazyModule(_LazyModuleMarker):
        def __mro__(self):
            return (LazyModule, ModuleType)
        def __getattribute__(self, attr):
            if module.value is None:
                del sys_modules[module_path]
                module.value = __import__(module_path)
                sys_modules[module_path] = __import__(module_path)
            return getattr(module.value, attr)
    sys_modules[module_path] = LazyModule()

class TestLazyModule(unittest.TestCase):
    def test_lazy_module(self):
        make_lazy('pytutils.lazy.simple_import')
        import pytutils.lazy.simple_import
        self.assertIsInstance(pytutils.lazy.simple_import, _LazyModuleMarker)

if __name__ == '__main__':
    unittest.main()