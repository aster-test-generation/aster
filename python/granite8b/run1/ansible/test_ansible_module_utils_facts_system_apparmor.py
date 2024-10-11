import unittest
import os
from ansible.module_utils.facts.collector import BaseFactCollector


class ApparmorFactCollector(BaseFactCollector):
    name = 'apparmor'
    _fact_ids = set()

    def collect(self, module=None, collected_facts=None):
        facts_dict = {}
        apparmor_facts = {}
        if os.path.exists('/sys/kernel/security/apparmor'):
            apparmor_facts['status'] = 'enabled'
        else:
            apparmor_facts['status'] = 'disabled'
        facts_dict['apparmor'] = apparmor_facts
        return facts_dict

def test_apparmor_fact_collector():
    collector = ApparmorFactCollector()
    facts = collector.collect()
    assert facts['apparmor']['status'] in ['enabled', 'disabled']

if __name__ == '__main__':
    unittest.main()