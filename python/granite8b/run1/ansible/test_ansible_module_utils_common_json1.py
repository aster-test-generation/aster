import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_preprocess_unsafe_encode(self):
        class UnsafeObject:
            __UNSAFE__ = True

        self.assertEqual(AnsibleJSONEncoder._preprocess_unsafe_encode(UnsafeObject()), {'__ansible_unsafe': 'True'})

        class SafeObject:
            pass

        self.assertEqual(AnsibleJSONEncoder._preprocess_unsafe_encode(SafeObject()), SafeObject())

        class SequenceObject:
            def __iter__(self):
                yield UnsafeObject()
                yield SafeObject()

        self.assertEqual(AnsibleJSONEncoder._preprocess_unsafe_encode(SequenceObject()), [{'__ansible_unsafe': 'True'}, SafeObject()])

        class MappingObject:
            def __iter__(self):
                yield 'unsafe', UnsafeObject()
                yield 'safe', SafeObject()

        self.assertEqual(AnsibleJSONEncoder._preprocess_unsafe_encode(MappingObject()), {'unsafe': {'__ansible_unsafe': 'True'}, 'safe': SafeObject()})

    def test_default(self):
        class VaultObject:
            __ENCRYPTED__ = True

        self.assertEqual(AnsibleJSONEncoder(vault_to_text=False).default(VaultObject()), {'__ansible_vault': 'vault_ciphertext'})

        class UnsafeObject:
            __UNSAFE__ = True

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=False).default(UnsafeObject()), {'__ansible_unsafe': 'True'})

        class SafeObject:
            pass

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=False).default(SafeObject()), SafeObject())

        class SequenceObject:
            def __iter__(self):
                yield UnsafeObject()
                yield SafeObject()

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=False).default(SequenceObject()), [{'__ansible_unsafe': 'True'}, SafeObject()])

        class MappingObject:
            def __iter__(self):
                yield 'unsafe', UnsafeObject()
                yield 'safe', SafeObject()

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=False).default(MappingObject()), {'unsafe': {'__ansible_unsafe': 'True'}, 'safe': SafeObject()})

        class DatetimeObject:
            def __init__(self, year, month, day):
                self.year = year
                self.month = month
                self.day = day

            def __iter__(self):
                yield 'year', self.year
                yield 'month', self.month
                yield 'day', self.day

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=False).default(DatetimeObject(2023, 1, 1)), {'year': 2023, 'month': 1, 'day': 1})

    def test_iterencode(self):
        class UnsafeObject:
            __UNSAFE__ = True

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=True).iterencode([UnsafeObject()]), '[{"__ansible_unsafe": "True"}]')

        class SafeObject:
            pass

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=True).iterencode([SafeObject()]), '[{"__ansible_unsafe": "True"}]')

        class SequenceObject:
            def __iter__(self):
                yield UnsafeObject()
                yield SafeObject()

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=True).iterencode(SequenceObject()), '[{"__ansible_unsafe": "True"}, {}]')

        class MappingObject:
            def __iter__(self):
                yield 'unsafe', UnsafeObject()
                yield 'safe', SafeObject()

        self.assertEqual(AnsibleJSONEncoder(preprocess_unsafe=True).iterencode(MappingObject()), '{"unsafe": {"__ansible_unsafe": "True"}, "safe": {}}')

if __name__ == '__main__':
    unittest.main()