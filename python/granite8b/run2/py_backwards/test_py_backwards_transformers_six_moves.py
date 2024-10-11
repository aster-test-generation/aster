from py_backwards.utils.helpers import eager
from py_backwards.transformers.base import BaseImportRewrite

# py_backwards/transformers/six_moves.py
class MovedAttribute:
    def __init__(self, name, old_mod, new_mod, old_attr=None, new_attr=None):
        self.name = name
        if new_mod is None:
            new_mod = name
        self.new_mod = new_mod
        if new_attr is None:
            if old_attr is None:
                new_attr = name
            else:
                new_attr = old_attr
        self.new_attr = new_attr

if __name__ == '__main__':
    unittest.main()